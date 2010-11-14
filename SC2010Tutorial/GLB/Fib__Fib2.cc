#include <Fib__Fib2.h>


#include "Fib__Fib2.inc"

void Fib__Fib2::_instance_init() {
    _I_("Doing initialisation for class: Fib__Fib2");
    
}


//#line 23 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10MethodDecl_c
void Fib__Fib2::runTask(x10_uint t, x10aux::ref<x10::util::Stack<x10_uint> > s) {
    
    //#line 24 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10If_c
    if (((t) < (((x10_uint)20u)))) {
        
        //#line 25 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": polyglot.ast.Eval_c
        x10::lang::Runtime__CollectingFinish<void>::offer<x10_uint >(Fib::fib(
                                                                       t));
    } else {
        
        //#line 27 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": polyglot.ast.Eval_c
        x10aux::nullCheck(s)->push(((x10_uint) ((t) - (((x10_int)1)))));
        
        //#line 28 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": polyglot.ast.Eval_c
        x10aux::nullCheck(s)->push(((x10_uint) ((t) - (((x10_int)2)))));
    }
    
}

//#line 31 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10MethodDecl_c
void Fib__Fib2::runRootTask(x10_uint t, x10aux::ref<x10::util::Stack<x10_uint> > s) {
    
    //#line 32 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": polyglot.ast.Eval_c
    ((x10aux::ref<Fib__Fib2>)this)->Fib__Fib2::runTask(t, s);
}

//#line 22 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10ConstructorDecl_c
void Fib__Fib2::_constructor() {
    this->TaskFrame<x10_uint, x10_uint>::_constructor();
    {
     
    }
    
}
x10aux::ref<Fib__Fib2> Fib__Fib2::_make() {
    x10aux::ref<Fib__Fib2> this_ = new (memset(x10aux::alloc<Fib__Fib2>(), 0, sizeof(Fib__Fib2))) Fib__Fib2();
    this_->_constructor();
    return this_;
}


const x10aux::serialization_id_t Fib__Fib2::_serialization_id = 
    x10aux::DeserializationDispatcher::addDeserializer(Fib__Fib2::_deserializer<x10::lang::Reference>);

void Fib__Fib2::_serialize(x10aux::ref<Fib__Fib2> this_,
                           x10aux::serialization_buffer& buf) {
    _serialize_reference(this_, buf);
    if (this_ != x10aux::null) {
        this_->_serialize_body(buf);
    }
}

void Fib__Fib2::_serialize_body(x10aux::serialization_buffer& buf) {
    TaskFrame<x10_uint, x10_uint>::_serialize_body(buf);
    
}

void Fib__Fib2::_deserialize_body(x10aux::deserialization_buffer& buf) {
    TaskFrame<x10_uint, x10_uint>::_deserialize_body(buf);
    
}

x10aux::RuntimeType Fib__Fib2::rtt;
void Fib__Fib2::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const x10aux::RuntimeType* parents[1] = { x10aux::getRTT<TaskFrame<x10_uint, x10_uint> >()};
    rtt.initStageTwo("Fib.Fib2", 1, parents, 0, NULL, NULL);
}
