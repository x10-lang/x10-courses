#ifndef __UTS__SHA1RAND_H
#define __UTS__SHA1RAND_H

#include <x10rt.h>

#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS

namespace x10 {
    namespace lang {
        class String;
    }
}

#include "sha1_rand.hpp"
#include <x10aux/config.h>
#include <x10aux/ref.h>
#include <x10aux/RTT.h>
#include <x10aux/serialization.h>

namespace examples {
    namespace UTS {

        class UTS__SHA1Rand {
        public:
            RTT_H_DECLS_STRUCT
        
                sha1_rand FMGL(cxx_sha1_rng);

            UTS__SHA1Rand* operator->() { return this; }
    
            static x10aux::itable_entry _itables[2];
            x10aux::itable_entry* _getITables() { return _itables; }
            static x10::lang::Any::itable<UTS__SHA1Rand > _itable_0;

            static x10aux::itable_entry _iboxitables[2];
            x10aux::itable_entry* _getIBoxITables() { return _iboxitables; }

            static UTS__SHA1Rand _alloc() {
                UTS__SHA1Rand t;
                memset(&t, 0, sizeof(UTS__SHA1Rand));
                return t;
            }

            inline static UTS__SHA1Rand _make(x10_int seed) {
                UTS__SHA1Rand this_; 
                this_->_constructor(seed);
                return this_;
            }
            void _constructor(x10_int seed) {
                FMGL(cxx_sha1_rng).init((int)seed);
            }
    
            inline static UTS__SHA1Rand _make(UTS__SHA1Rand parent, x10_int spawn_number) {
                UTS__SHA1Rand this_; 
                this_->_constructor(parent, spawn_number);
                return this_;
            }
            void _constructor(UTS__SHA1Rand parent, x10_int spawn_number) {
                FMGL(cxx_sha1_rng).init(parent->FMGL(cxx_sha1_rng), (int)spawn_number);
            }

            x10_int __apply() {
                return FMGL(cxx_sha1_rng)();
            }
        
            static void _serialize(UTS__SHA1Rand this_, x10aux::serialization_buffer& buf);
    
            static UTS__SHA1Rand _deserialize(x10aux::deserialization_buffer& buf) {
                UTS__SHA1Rand this_;
                this_->_deserialize_body(buf);
                return this_;
            }
    
            void _deserialize_body(x10aux::deserialization_buffer& buf);

            x10_boolean _struct_equals(UTS__SHA1Rand that);
    
            x10_boolean equals(x10aux::ref<x10::lang::Any> that);
    
            x10_boolean equals(UTS__SHA1Rand that);
    
            x10aux::ref<x10::lang::String> toString();
    
            x10_int hashCode();
    
            x10aux::ref<x10::lang::String> typeName();
        };

    }
}

#endif 

