#include <Fib__Anonymous__0.h>


#include "Fib__Anonymous__0.inc"

x10::lang::Reducible<x10_uint>::itable<Fib__Anonymous__0 >  Fib__Anonymous__0::_itable_0(&Fib__Anonymous__0::apply, &Fib__Anonymous__0::equals, &Fib__Anonymous__0::hashCode, &Fib__Anonymous__0::toString, &Fib__Anonymous__0::typeName, &Fib__Anonymous__0::zero);
x10::lang::Any::itable<Fib__Anonymous__0 >  Fib__Anonymous__0::_itable_1(&Fib__Anonymous__0::equals, &Fib__Anonymous__0::hashCode, &Fib__Anonymous__0::toString, &Fib__Anonymous__0::typeName);
x10aux::itable_entry Fib__Anonymous__0::_itables[3] = {x10aux::itable_entry(&x10aux::getRTT<x10::lang::Reducible<x10_uint> >, &_itable_0), x10aux::itable_entry(&x10aux::getRTT<x10::lang::Any>, &_itable_1), x10aux::itable_entry(NULL, (void*)x10aux::getRTT<Fib__Anonymous__0>())};
void Fib__Anonymous__0::_instance_init() {
    _I_("Doing initialisation for class: Fib__Anonymous__0");
    
}


//#line 44 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10MethodDecl_c
x10_uint Fib__Anonymous__0::zero() {
    
    //#line 44 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10Return_c
    return ((x10_uint)0u);
    
}

//#line 45 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10MethodDecl_c
x10_uint Fib__Anonymous__0::apply(x10_uint a, x10_uint b) {
    
    //#line 45 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10Return_c
    return ((x10_uint) ((a) + (b)));
    
}

//#line 43 "/gsa/yktgsa-h1/06/vj0/myGLB21/Fib.x10": x10.ast.X10ConstructorDecl_c
void Fib__Anonymous__0::_constructor() {
    this->x10::lang::Object::_constructor();
    
}
x10aux::ref<Fib__Anonymous__0> Fib__Anonymous__0::_make() {
    x10aux::ref<Fib__Anonymous__0> this_ = new (memset(x10aux::alloc<Fib__Anonymous__0>(), 0, sizeof(Fib__Anonymous__0))) Fib__Anonymous__0();
    this_->_constructor();
    return this_;
}


const x10aux::serialization_id_t Fib__Anonymous__0::_serialization_id = 
    x10aux::DeserializationDispatcher::addDeserializer(Fib__Anonymous__0::_deserializer<x10::lang::Reference>);

void Fib__Anonymous__0::_serialize(x10aux::ref<Fib__Anonymous__0> this_,
                                   x10aux::serialization_buffer& buf) {
    _serialize_reference(this_, buf);
    if (this_ != x10aux::null) {
        this_->_serialize_body(buf);
    }
}

void Fib__Anonymous__0::_serialize_body(x10aux::serialization_buffer& buf) {
    x10::lang::Object::_serialize_body(buf);
    
}

void Fib__Anonymous__0::_deserialize_body(x10aux::deserialization_buffer& buf) {
    x10::lang::Object::_deserialize_body(buf);
    
}

x10aux::RuntimeType Fib__Anonymous__0::rtt;
void Fib__Anonymous__0::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const x10aux::RuntimeType* parents[2] = { x10aux::getRTT<x10::lang::Object>(), x10aux::getRTT<x10::lang::Reducible<x10_uint> >()};
    rtt.initStageTwo("Fib.Anonymous.0", 2, parents, 0, NULL, NULL);
}
