(ns tutorial.Atoms)

(defn Atoms
    []
    (def amount (atom 100))
    (println @amount)
    (swap! amount inc) ;; applique une fonction sur l'atom
    (println @amount)
    (reset! amount 110) ;; change la valeur de l'atom
    (compare-and-set! amount 110 120) ;; compare la valeur et remplace. Si 110, remplacer par 120
    (println @amount)
    (compare-and-set! amount 110 150)
    (println @amount)

)
(Atoms)