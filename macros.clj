(ns user)

(def foo 10)

(defmacro named-clauses [& body]
  `(zipmap ~(vec (map str body)) [~@body]))

(named-clauses foo [1 2 3 4])
