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