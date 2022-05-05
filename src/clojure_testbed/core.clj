(ns clojure-testbed.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn is-even
  "Check if number is even"
  [x]
  (if (== (mod x 2) 0) (println "is even") (println "is odd")))
