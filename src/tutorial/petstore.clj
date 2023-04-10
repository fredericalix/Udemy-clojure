(ns tutorial.petstore) ;; Creation du namespace petstore

(defn petToHumanAge ;; Creation de la fonction petToHumanAge
    "This function returns the age of a pet in human years" ;; Description de la fonction
    [x] ;; Cette fonction attend un argument (x)
    (def petStore {'dog 7, 'cat 5, 'goldfish 10}) ;; Déclaration de la variable
                                                ;; petStore qui contient une
                                                ;; map contenant 3 keywords
    (get petStore x)) ;; Retourne le keyword correspondant à x

(defn age ;; Creation de la fonction age
    "This functions returns the age of a pet" ;; Description de la fonction
    [petName petType petAge] ;; Cette fonction attend 3 arguments
    (def ratio (petToHumanAge petType)) ;; Declaration de la variable ratio
                                        ;; elle appel la fonction precedente
    ;; appel de la fonction println pour afficher le nom et l age x ratio de l'animal
    (println petName "is" (* ratio petAge) "years old in human years"))

(defn -main
    "The main function"
    []
    (age "Fido" 'dog 4)
    (age "Fifi" 'cat 2)
    (age "Bubbles" 'goldfish 10))