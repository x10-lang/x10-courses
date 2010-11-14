#ifndef __FIB__FIB2_H
#define __FIB__FIB2_H

#include <x10rt.h>


#define TASKFRAME_H_NODEPS
#include <TaskFrame.h>
#undef TASKFRAME_H_NODEPS
namespace x10 { namespace lang { 
class UInt;
} } 
#include <x10/lang/UInt.struct_h>
namespace x10 { namespace util { 
template<class FMGL(T)> class Stack;
} } 
namespace x10 { namespace lang { 
template<class FMGL(T)> class Runtime__CollectingFinish;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
class Fib;
class Fib__Fib2 : public TaskFrame<x10_uint, x10_uint>   {
    public:
    RTT_H_DECLS_CLASS
    
    void _instance_init();
    
    virtual void runTask(x10_uint t, x10aux::ref<x10::util::Stack<x10_uint> > s);
    virtual void runRootTask(x10_uint t, x10aux::ref<x10::util::Stack<x10_uint> > s);
    void _constructor();
    
    static x10aux::ref<Fib__Fib2> _make();
    
    
    // Serialization
    public: static const x10aux::serialization_id_t _serialization_id;
    
    public: static void _serialize(x10aux::ref<Fib__Fib2> this_,
                                   x10aux::serialization_buffer& buf);
    
    public: x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: void _serialize_body(x10aux::serialization_buffer& buf);
    
    public: template<class __T> static x10aux::ref<__T> _deserializer(x10aux::deserialization_buffer& buf);
    
    public: template<class __T> static x10aux::ref<__T> _deserialize(x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(x10aux::deserialization_buffer& buf);
    
};
#endif // FIB__FIB2_H

class Fib__Fib2;

#ifndef FIB__FIB2_H_NODEPS
#define FIB__FIB2_H_NODEPS
#include <TaskFrame.h>
#include <x10/lang/UInt.h>
#include <x10/util/Stack.h>
#include <x10/lang/Runtime__CollectingFinish.h>
#include <x10/lang/Runtime.h>
#include <Fib.h>
#ifndef FIB__FIB2_H_GENERICS
#define FIB__FIB2_H_GENERICS
template<class __T> x10aux::ref<__T> Fib__Fib2::_deserializer(x10aux::deserialization_buffer& buf) {
    x10aux::ref<Fib__Fib2> this_ = new (memset(x10aux::alloc<Fib__Fib2>(), 0, sizeof(Fib__Fib2))) Fib__Fib2();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class __T> x10aux::ref<__T> Fib__Fib2::_deserialize(x10aux::deserialization_buffer& buf) {
    x10::lang::Object::_reference_state rr = x10::lang::Object::_deserialize_reference_state(buf);
    if (0 == rr.ref) {
        return x10aux::null;
    } else {
        x10aux::ref<Fib__Fib2> res;
        res = Fib__Fib2::_deserializer<Fib__Fib2>(buf);
        _S_("Deserialized a "<<ANSI_SER<<ANSI_BOLD<<"class"<<ANSI_RESET<<"Fib__Fib2");
        return res;
    }
    
}

#endif // FIB__FIB2_H_GENERICS
#endif // __FIB__FIB2_H_NODEPS
