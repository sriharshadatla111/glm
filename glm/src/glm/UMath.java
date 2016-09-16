/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import joou.UByte;
import joou.UInteger;
import joou.ULong;
import joou.UShort;

/**
 *
 * @author GBarbieri
 */
public class UMath {

    public static UByte max(UByte a, UByte b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static UInteger max(UInteger a, UInteger b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static ULong max(ULong a, ULong b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static UShort max(UShort a, UShort b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static UByte min(UByte a, UByte b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static UInteger min(UInteger a, UInteger b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static ULong min(ULong a, ULong b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static UShort min(UShort a, UShort b) {
        return a.compareTo(b) < 0 ? a : b;
    }

}
