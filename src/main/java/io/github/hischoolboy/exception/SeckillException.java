package io.github.hischoolboy.exception;

/**
 * 秒杀相关业务异常
 *  Created by hischoolboy on 2017/5/20.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
