# Ableton Dev Salon
An Introduction to ClojureScript
### Brent Shields and Jack Schaedler
### 17.04.2014

---

# Clojure
### A Lisp dialect for the JVM
- Dynamic
- Hosted / Leverages Java ecosystem
- Built-in collection of __immutable__, __persistent__ data structures
- Concurrency done right / STM Agents CSP TLS
- Metaprogramming / Macros
- Functional but pragmatic

---

# ClojureScript
### Clojure compiled to JavaScript
- Run on JS clients / Browser Desktop Mobile Server
- Interop with JS libraries
- Leverage the Googleplex via Closure compiler
- Dynamic host language enables additional features

---
#Who
##Rich Hickey
![right 150%](hickey.jpeg)

- Clojure creator and provocative speaker
- Highly recommended talks
  - Are we there yet?
  - Simple made easy
  - Hammock driven development
  - The value of values

---

#Who
## David Nolen
![right 800%](nolen.jpeg)

- TODO: Pic, links to talks

---

#The Absolute Basics

![inline 85%](basics.png)

---

#Data Structures

![inline 95%](hetero.png)

---

#First Class Functions

![inline 90%](functions.png)

---

#Metaprogramming
##Macros

![inline 90%](macros.png)

---

#Macros provide extensible semantics

Enables 'language features' as libraries

- _Logic programming_: `core.logic`

- _Optional type system with inference_: `core.typed`

- _Pattern matching_: `core.match`

- _CSP_: `core.async`

---

#Data Structures
##Immutable and Persistent - Vectors

```clojure
> (def foo [1 2 3])
=> [1 2 3]

> (conj foo 4)
=> [1 2 3 4]

> foo
=> [1 2 3]
```

---
#Data Structures
##Immutable and Persistent - Maps

```clojure
> (def person {:first "Jack" :last "Schaedler"})
=> {:first "Jack" :last "Schaedler"}

> (conj person {:last "Jones" :age 19})
=> {:first "Jack" :last "Jones" :age 19}

> person
=> {:first "Jack" :last "Schaedler"}
```

---

#Why?
###Epochal Model of Time

- Time is discrete
- Clients observe snapshots of state over time
- Snapshots of state are values. Values are immutable.
- The next time quantum is calculated as a function of the previous.
- procedural / OO time is implicit

---

#Isn't that inefficient?

- Naive implementation would just copy
- __Immutability enables structural sharing__
- Sophisticated data structure implementatation necessary for practical usage.
- Not sufficient to just avoid mutation in a procedural / OO language.

---

#funken

- Reactive programming with an epochal time model
- signals update over time, but only observed in discrete steps
- progression of time is explicit
- signals notify only when value actually changes

---

#funken example

analog of persistent data structure example
