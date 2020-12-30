package javatest.loader;

/**
 * @author zhuhe
 */
public interface Cipher {
    /**
     * 编码
     *
     * @param source 原代码
     * @param key    key
     * @return 编码
     */
    byte[] encrypt(byte[] source, byte[] key);

    /**
     * 解码
     *
     * @param source 原代码
     * @param key    key
     * @return 解码
     */
    byte[] decrypt(byte[] source, byte[] key);

    /**
     * 长度
     *
     * @return 长度
     */
    int strength();
}
