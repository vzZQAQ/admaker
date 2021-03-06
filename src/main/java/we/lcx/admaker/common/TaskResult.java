package we.lcx.admaker.common;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import java.util.Map;

/**
 * Created by Lin Chenxiao on 2019-12-22
 **/
@Slf4j
public class TaskResult {
    private boolean success = false;
    private Entity entity;
    private HttpHeaders headers;
    private Object error;
    private Object tag;

    public static TaskResult of() {
        return new TaskResult();
    }

    public static TaskResult of(ResponseEntity<String> resp, Object tag) {
        TaskResult result = new TaskResult();
        result.tag = tag;
        if (resp == null) return result;
        Map map = JSON.parseObject(resp.getBody(), Map.class);
        if (map == null) return result;
        result.entity = new Entity(map);
        result.headers = resp.getHeaders();
        Object success = map.get("success");
        result.success = success instanceof Boolean && (Boolean) success;
        if (!result.success) result.error = map.get("cause");
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public boolean logError(String text, Object... obj) {
        if (success) return true;
        log.error(text + " caused by " + error, obj);
        return false;
    }

    public TaskResult valid(String message) {
        if (success) return this;
        log.error(String.valueOf(error));
        throw new VisibleException(message);
    }

    public HttpHeaders getHeaders() { return headers; }

    public Entity getEntity() {
        return entity;
    }

    public Object getTag() { return tag; }
}
