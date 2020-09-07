package javatest.serviceLoader.impl;

import javatest.serviceLoader.Cipher;

import java.util.ServiceLoader;

public class CaesarCipher implements Cipher {

    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    @Override
    public byte[] encrypt(byte[] source, byte[] key) {
        var result = new byte[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (byte)(source[i] + key[0]);
        }
        return result;
    }

    @Override
    public byte[] decrypt(byte[] source, byte[] key) {
        return encrypt(source, new byte[]{ (byte) -key[0] });
    }

    @Override
    public int strength() {
        return 1;
    }

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader) {
            if (cipher.strength() >= minStrength) {
                return cipher;
            }
        }
        return null;
    }
}
