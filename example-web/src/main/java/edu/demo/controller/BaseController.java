package edu.demo.controller;

import edu.demo.dto.ResultDto;
import org.evergreen.web.HttpStatus;
import org.evergreen.web.ViewResult;
import org.evergreen.web.view.Json;

public class BaseController {

    public ViewResult successJson() {
        ResultDto dto = new ResultDto();
        return new Json(dto);
    }

    public ViewResult successJson(Object value) {
        ResultDto dto = new ResultDto();
        dto.setValue(value);
        return new Json(dto);
    }

    public ViewResult errorJson() {
        ResultDto dto = new ResultDto();
        dto.setCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        dto.setMsg("系统繁忙，请稍后再试!");
        return new Json(dto);
    }

    public ViewResult errorJson(String msg) {
        ResultDto dto = new ResultDto();
        dto.setCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        dto.setMsg(msg);
        return new Json(dto);
    }

    public ViewResult errorJson(int errorCode, String msg) {
        ResultDto dto = new ResultDto();
        dto.setCode(errorCode);
        dto.setMsg(msg);
        return new Json(dto);
    }
}
