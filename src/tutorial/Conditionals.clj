(ns tutorial.Conditionals)

(defn CondIf
    "Fonction verifiant que la variable x est égal à 5 ou pas."
    [x]
    (println "\nCondIf:")
    (if (= x 5)
        (println "Equal")
        (println "Not Equal")
    ))

(defn CondIfDo
    "Fonction avec deux statment"
    [x]
    (println "\nCondIfDo:")
    (if (= x 5)
        (do (println "Equal first statement")
            (println "Second statement of the first"))
        (do (println "Not equal first statement")
            (println "Second statement of the second"))
    )
)

(defn CondNestedIf
    [x y]
    (println "\nNestedIf:")
    (if (and (= x 5) (or (= 2 y) (not true)))
        (println "True")
        (println "False")
    )
)

(defn CondCase
    [pet]
    (println "\nCondCase:")
    (case pet
        "cat" (println "I have a cat")
        "dog" (println "I have a dog")
        "goldfish" (println "I have a goldfish")
    )
)

(defn CondCond
    [amount]
    (cond
        (<= amount 10) (println "Few")
        (<= amount 100) (println "Several")
        (<= amount 1000) (println "Many")
        :else (println "Loads")
    )
)