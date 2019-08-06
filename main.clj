(def n1 80) (def n2 40) (def n3 0) (def np 40)

(def x ["Cuando tus estudiantes demuestran que pueden ir más allá de lo que aprenden en clases de Programación.Felicitaciones #smartBytes y #1024bits @pyweekend #yosoyespol #enespoltodosprograman @espol_fiec @espol" "Hoy en el @pyweekend #PyweekendEspol #Pyweekwnd4E" "Hoy asistí al #pyweekend realizado en @espol" "Excelente experiencia en @espol durante el #pyweekend"])

(defn calcular[]
(def d (+ (* (mod 7 3) 4) 5))
(def aux (reduce * (repeat 10 d)))
(println aux)
)

(defn aprobar
([n1 n2 n3] (if  (> 60 (/ (- (+ n1 n2 n3) (min n1 n2 n3)) 2)) (println "Notas: " n1 n2 n3 ">> RP") (println "Notas: " n1 n2 n3 ">> AP"))
)

([n1 n2 n3 np] (if  (> 60 (- (+ n1 n2 n3 np) (min n1 n2 n3))) (println ">> RP") (println ">> AP")))

([n1 n2 n3 np pd1 pd2]
(println "Notas teoricas: " n1 n2 n3 "Nota practica: " np)
(aprobar (/ (* n1 pd1) 2) (/ (* n2 pd1) 2) (/ (* n3 pd1) 2) (* np pd2))
)
)

(defn input[]
(loop [r 0]
(when (not(= r 100))
(println "Ingrese ponderacion teorica: ")
(def p1 (read-line))
(println "Ingrese ponderacion practica: ")
(def p2 (read-line))
(def pd1 (Integer/parseInt (re-find  #"\d+" p1)))
(def pd2 (Integer/parseInt (re-find  #"\d+" p2)))
(def t (+ pd1 pd2))
(if (= t 100) (recur (+ r 100)) (recur (+ r 0)))
))

(aprobar n1 n2 n3 np (/ pd1 100) (/ pd2 100))
)

(defn regex[]

(def b (for [i x] (distinct (re-matches #"([a-z|A-Z|0-9| |\D]+@espol[a-z|A-Z|0-9| |\D]*#pyweekend[a-z|A-Z|0-9| |\D]*)|([a-z|A-Z|0-9| |\D]*#pyweekend[a-z|A-Z|0-9| |\D]+@espol{1,}[a-z|A-Z|0-9| |\D]*)" i))))

(def result (remove nil? (for [j b] (println (remove nil? j)))))
(println result)
)


(println "*** Ejercicio 1 ***")
(calcular)
(println "*** Ejercicio 2 ***")
(aprobar n1 n2 n3)
(println "*** Ejercicio 3 ***")
(input)
(println "*** Ejercicio 4 ***")
(regex)













