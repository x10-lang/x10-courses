#ifndef __FIB__ANONYMOUS__0_H
#define __FIB__ANONYMOUS__0_H

#include <x10rt.h>


#define X10_LANG_OBJECT_H_NODEPS
#include <x10/lang/Object.h>
#undef X10_LANG_OBJECT_H_NODEPS
#define X10_LANG_REDUCIBLE_H_NODEPS
#include <x10/lang/Reducible.h>
#undef X10_LANG_REDUCIBLE_H_NODEPS
namespace x10 { namespace lang { 
class UInt;
} } 
#include <x10/lang/UInt.struct_h>
class Fib__Anonymous__0 : public x10::lang::Object   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10aux::itable_entry _itables[3];
    
    virtual x10aux::itable_entry* _getITables() { return _itables; }
    
    static x10::lang::Reducible<x10_uint>::itable<Fib__Anonymous__0 > _itable_0;
    
    static x10::lang::Any::itable<Fib__Anonymous__0 > _itable_1;
    
    void _instance_init();
    
    virtual x10_uint zero();
    virtual x10_uint apply(x10_uint a, x10_uint b);
    void _constructor();
    
    static x10aux::ref<Fib__Anonymous__0> _make();
    
    
    // Serialization
    public: static const x10aux::serialization_id_t _serialization_id;
    
    public: static void _serialize(x10aux::ref<Fib__Anonymous__0> this_,
                                   x10aux::serialization_buffer& buf);
    
    public: x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: void _serialize_body(x10aux::serialization_buffer& buf);
    
    public: template<class __T> static x10aux::ref<__T> _deserializer(x10aux::deserialization_buffer& buf);
    
    public: template<class __T> static x10aux::ref<__T> _deserialize(x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(x10aux::deserialization_buffer& buf);
    
};
#endif // FIB__ANONYMOUS__0_H

class Fib__Anonymous__0;

#ifndef FIB__ANONYMOUS__0_H_NODEPS
#define FIB__ANONYMOUS__0_H_NODEPS
#include <x10/lang/Object.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/UInt.h>
#ifndef FIB__ANONYMOUS__0_H_GENERICS
#define FIB__ANONYMOUS__0_H_GENERICS
template<class __T> x10aux::ref<__T> Fib__Anonymous__0::_deserializer(x10aux::deserialization_buffer& buf) {
    x10aux::ref<Fib__Anonymous__0> this_ = new (memset(x10aux::alloc<Fib__Anonymous__0>(), 0, sizeof(Fib__Anonymous__0))) Fib__Anonymous__0();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class __T> x10aux::ref<__T> Fib__Anonymous__0::_deserialize(x10aux::deserialization_buffer& buf) {
    x10::lang::Object::_reference_state rr = x10::lang::Object::_deserialize_reference_state(buf);
    if (0 == rr.ref) {
        return x10aux::null;
    } else {
        x10aux::ref<Fib__Anonymous__0> res;
        res = Fib__Anonymous__0::_deserializer<Fib__Anonymous__0>(buf);
        _S_("Deserialized a "<<ANSI_SER<<ANSI_BOLD<<"class"<<ANSI_RESET<<"Fib__Anonymous__0");
        return res;
    }
    
}

#endif // FIB__ANONYMOUS__0_H_GENERICS
#endif // __FIB__ANONYMOUS__0_H_NODEPS
