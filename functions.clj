;; functions are values
(defn fn-compare [f1 f2 x]
  (= (f1 x) (f2 x)))

(fn-compare inc (fn [x] (+ x 1)) 10)

;; # is shorthand function syntax
(fn-compare inc #(+ % 1) 10)