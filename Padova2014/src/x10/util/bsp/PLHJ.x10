package x10.util.bsp;

public type PLHJ[S, T]{T <: Agent[S, T]} = PlaceLocalHandle[JobRunner[S, T]];