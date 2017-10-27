package com.maihaoche.brz.network;

import com.maihaoche.brz.command.AbstractCommand;

import java.io.IOException;

/**
 * Created by alex on 2017/10/24.
 */
public interface HttpClient {
    <T> T get(String url, AbstractCommand command, Class<T> returnType) throws IOException;

    <T> T get(String url, AbstractCommand command, Class<T> returnType, String accessToken) throws IOException;

    void post(String url, AbstractCommand command, String accessToken) throws IOException;
}
