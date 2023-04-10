(ns tutorial.functions ;; déclaration d'un namespace
  (:gen-class)) ;; gen-class pour générer une classe java

(defn -main ;; déclaration de la fonction main
  "First function"
  []
  
(println "My name is John")
(println "lobing Clojure so far")
(+ 2 5)
(DataTypes)) ;; appel de la fonction DataTypes

(def increment (fn [x] (+ x 1))) ;; attribue une fonction une variable

(defn increment_set
[]
(map increment [1 2 4]))

(defn increment_set2
[x]
(map increment x))

(defn DataTypes [] ;; Creation de la fonction DataTypes
  (def a 1) ;; Declaration de la variable a de type integer
  (def b 1.25) ;; Declaration de la variable b de type float
  (def c 1.25e-12) ;; Declaration de la variable c de type float scientifique
  (def d 0xfbfc) ;; Declaration de la variable d de type hexadecimal
  (def e nil) ;; Declaration de la variable e de type nil
  (def f true) ;; Declaration de la variable f de type booleen
  (def g "Hello") ;; Declaration de la variable g de type string
  (def h 'thanks) ;; Declaration de la variable h de type keyword

;; les variables sont key-sensitives
  (def status true) ;; Declaration de la variable status
  (def STATUS false) ;; Declaration de la variable STATUS
  
  (println a) ;; affichage de la variable a
  (println b) ;; affichage de la variable b
  (println c) ;; affichage de la variable c
  (println d) ;; affichage de la variable d
  (println e) ;; affichage de la variable e
  (println f) ;; affichage de la variable f
  (println g) ;; affichage de la variable g
  (println h) ;; affichage de la variable h
  (println status) ;; affichage de la variable status
  (println STATUS)) ;; affichage de la variable STATUS