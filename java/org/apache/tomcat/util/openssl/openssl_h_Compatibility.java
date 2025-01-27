/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

/**
 * Methods used present in older OpenSSL versions but not in the current major version.
 */
public class openssl_h_Compatibility {

    // OpenSSL 1.1 FIPS_mode
    public static MethodHandle FIPS_mode$MH() {
        class Holder {
            static final FunctionDescriptor DESC = FunctionDescriptor.of(
                JAVA_INT
            );
    
            static final MethodHandle MH = Linker.nativeLinker().downcallHandle(
                    openssl_h.findOrThrow("FIPS_mode"),
                    DESC);
        }
        return Holder.MH;
    }

    public static int FIPS_mode() {
        var mh$ = FIPS_mode$MH();
        try {
            return (int) mh$.invokeExact();
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    // OpenSSL 1.1 FIPS_mode_set
    public static MethodHandle FIPS_mode_set$MH() {
        class Holder {
            static final FunctionDescriptor DESC = FunctionDescriptor.of(
                JAVA_INT, JAVA_INT
            );
    
            static final MethodHandle MH = Linker.nativeLinker().downcallHandle(
                    openssl_h.findOrThrow("FIPS_mode_set"),
                    DESC);
        }
        return Holder.MH;
    }

    public static int FIPS_mode_set(int r) {
        var mh$ = FIPS_mode_set$MH();
        try {
            return (int) mh$.invokeExact(r);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    // OpenSSL 1.1 EVP_PKEY_base_id
    public static MethodHandle EVP_PKEY_base_id$MH() {
        class Holder {
            static final FunctionDescriptor DESC = FunctionDescriptor.of(
                JAVA_INT, openssl_h.C_POINTER
            );
    
            static final MethodHandle MH = Linker.nativeLinker().downcallHandle(
                    openssl_h.findOrThrow("EVP_PKEY_base_id"),
                    DESC);
        }
        return Holder.MH;
    }

    public static int EVP_PKEY_base_id(MemorySegment pkey) {
        var mh$ = EVP_PKEY_base_id$MH();
        try {
            return (int) mh$.invokeExact(pkey);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    // OpenSSL 1.1 EVP_PKEY_bits
    public static MethodHandle EVP_PKEY_bits$MH() {
        class Holder {
            static final FunctionDescriptor DESC = FunctionDescriptor.of(
                JAVA_INT, openssl_h.C_POINTER
            );
    
            static final MethodHandle MH = Linker.nativeLinker().downcallHandle(
                    openssl_h.findOrThrow("EVP_PKEY_bits"),
                    DESC);
        }
        return Holder.MH;
    }

    public static int EVP_PKEY_bits(MemorySegment pkey) {
        var mh$ = EVP_PKEY_bits$MH();
        try {
            return (int) mh$.invokeExact(pkey);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    // OpenSSL 1.1 SSL_get_peer_certificate
    public static MethodHandle SSL_get_peer_certificate$MH() {
        class Holder {
            static final FunctionDescriptor DESC = FunctionDescriptor.of(
                    openssl_h.C_POINTER, openssl_h.C_POINTER
            );
    
            static final MethodHandle MH = Linker.nativeLinker().downcallHandle(
                    openssl_h.findOrThrow("SSL_get_peer_certificate"),
                    DESC);
        }
        return Holder.MH;
    }

    public static MemorySegment SSL_get_peer_certificate(MemorySegment s) {
        var mh$ = SSL_get_peer_certificate$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

}

