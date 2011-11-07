#include <SHA1Rand.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>


class SHA1Rand_ibox0 : public x10::lang::IBox<SHA1Rand> {
public:
    static x10::lang::Any::itable<SHA1Rand_ibox0 > itable;
    x10_boolean equals(x10aux::ref<x10::lang::Any> arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    x10aux::ref<x10::lang::String> toString() {
        return this->value->toString();
    }
    x10aux::ref<x10::lang::String> typeName() {
        return x10aux::type_name(this->value);
    }
    
};
x10::lang::Any::itable<SHA1Rand_ibox0 >  SHA1Rand_ibox0::itable(&SHA1Rand_ibox0::equals, &SHA1Rand_ibox0::hashCode, &SHA1Rand_ibox0::toString, &SHA1Rand_ibox0::typeName);
x10::lang::Any::itable<SHA1Rand >  SHA1Rand::_itable_0(&SHA1Rand::equals, &SHA1Rand::hashCode, &SHA1Rand::toString, &SHA1Rand::typeName);
x10aux::itable_entry SHA1Rand::_itables[2] = {x10aux::itable_entry(&x10aux::getRTT<x10::lang::Any>, &SHA1Rand::_itable_0), x10aux::itable_entry(NULL, (void*)x10aux::getRTT<SHA1Rand>())};
x10aux::itable_entry SHA1Rand::_iboxitables[2] = {x10aux::itable_entry(&x10aux::getRTT<x10::lang::Any>, &SHA1Rand_ibox0::itable), x10aux::itable_entry(NULL, (void*)x10aux::getRTT<SHA1Rand>())};

x10_boolean SHA1Rand::_struct_equals(SHA1Rand that) {
    for (int i=0 ; i<20 ; ++i) {
        if (FMGL(cxx_sha1_rng).rng_state[i] != that.FMGL(cxx_sha1_rng).rng_state[i]) return false;
    }

    return true;
}
void SHA1Rand::_serialize(SHA1Rand this_, x10aux::serialization_buffer& buf) {
    for (int i=0 ; i<20 ; ++i) {
        buf.write(this_.FMGL(cxx_sha1_rng).rng_state[i]);
    }
}

void SHA1Rand::_deserialize_body(x10aux::deserialization_buffer& buf) {
    for (int i=0 ; i<20 ; ++i) {
        FMGL(cxx_sha1_rng).rng_state[i] = buf.read<unsigned char>();
    }
}


x10_boolean SHA1Rand::equals(x10aux::ref<x10::lang::Any> that) {
    x10aux::ref<x10::lang::Reference> thatAsRef(that);
    if (thatAsRef->_type()->equals(x10aux::getRTT<SHA1Rand >())) {
        x10aux::ref<x10::lang::IBox<SHA1Rand > > thatAsIBox(that);
        return _struct_equals(thatAsIBox->value);
    }
    return false;
}

x10_boolean SHA1Rand::equals(SHA1Rand that) {
    return _struct_equals(that);
}

x10aux::ref<x10::lang::String> SHA1Rand::toString() {
    return x10::lang::String::Lit("SHA1Rand: detailed toString not defined.");
}

x10_int SHA1Rand::hashCode() {
    unsigned char *tmp = &(FMGL(cxx_sha1_rng).rng_state[0]);
    return *((x10_int*)tmp);
}

x10aux::ref<x10::lang::String> SHA1Rand::typeName() {
    return x10aux::type_name(*this);
}

x10aux::RuntimeType SHA1Rand::rtt;
void SHA1Rand::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const x10aux::RuntimeType* parents[2] = { x10aux::getRTT<x10::lang::Any>(), x10aux::getRTT<x10::lang::Any>()};
    rtt.initStageTwo("SHA1Rand", x10aux::RuntimeType::struct_kind, 2, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}


