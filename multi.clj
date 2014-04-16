(defmulti sounds-good? :cables)
(defmethod sounds-good? :pricey [_]
  "very clarity")
(defmethod sounds-good? :cheap [_]
  "much mud")

(sounds-good? {:cables :pricey})

(sounds-good? {:cables :cheap})