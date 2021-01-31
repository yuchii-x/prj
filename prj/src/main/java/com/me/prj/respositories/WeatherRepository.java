package com.me.prj.respositories;

import java.util.Map;
import org.springframework.stereotype.Repository;
import com.alibaba.fastjson.JSONObject;
import com.me.prj.util.HttpRequest;

/**
 * data 入口
 * @author yuchi
 *
 */
@Repository
public class WeatherRepository{
	
	public Map find(Integer id) {
		String res = HttpRequest.sendGet(id);
		JSONObject jsonObject = JSONObject.parseObject(res);
		return jsonObject.getJSONObject("result");
	}
}
