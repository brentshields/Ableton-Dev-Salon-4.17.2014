(def state (atom 5))

@state

(swap! state inc)

@state

(reset! state "hello")

@state
