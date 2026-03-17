# einstein

> [!NOTE]
> This project is currently minimal and under development.

 ⚛︎ Small classical physics utilities written in Clojure. 
 
## Functionalities

* Delta (difference between values)
* Rate
* Average velocity
* Acceleration
* Uniform motion (position, time)
* Uniformly accelerated motion (velocity, position)
* Torricelli's equation

## Usage Method

### Clone the repository

```bash
git clone https://github.com/gusutabo/einstein.git
cd einstein
```

### Run in REPL

```clojure
(require '[einstein.kinematics :as k])

(k/average-velocity 0 10 0 2)
;; => 5

(k/acceleration 0 20 0 4)
;; => 5

(k/position 0 10 3)
;; => 30

(k/velocity-uam 0 2 5)
;; => 10

(k/torricelli-velocity-squared 0 2 0 5)
;; => 20
```

## Goal

The goal of this project is to explore physics concepts through functional programming, using Clojure to implement and understand fundamental ideas from classical mechanics.

## License

This project is licensed under the MIT License.
