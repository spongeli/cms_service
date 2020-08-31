package com.spongeli.service.service.commonservice;

import java.util.Map;

public interface AliSmsService {
    boolean sendAliSmsService(String phone, Map<String, String> param);
    boolean sendAliSmsService(String phone, String code);
}
