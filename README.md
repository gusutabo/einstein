# Einstein

Small physics utilities written in Clojure.

## Functionalities

Currently, we have the following kinematics functions:

```
Delta
Rate
Average Velocity
Acceleration
Position
Velocity (uniformly accelerated motion)
Position (uniformly accelerated motion)
Torricelli equation
Time calculation
```

## Usage

First, require your namespace in a REPL or another Clojure file:

```clojure
(require '[einstein.kinematics :as k])
```

And then, feel free to use it. ;)

```clojure
;; v = v0 + a*t
(k/velocity-uam 5 5 4)
;; => 25
``` 
