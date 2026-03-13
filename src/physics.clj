(ns physics)

(defn verify-nums 
  "Validates that all elements in xs are present and numeric.
  
    Throws an ExceptionInfo if:
    - any argument is nil
    - any argument is not a number"
  [xs]
  (when (some nil? xs)
    (throw (ex-info "Argument is missing." {:args xs})))
  (when-not (every? number? xs)
    (throw (ex-info "Arguments must be numbers." {:args xs}))))

(defn delta
  "Calculates the difference between the final and initial values.
  Formula: Δx = final - initial"
  [initial final]
  (- final initial))

(defn rate
  "Calculates the rate of change between two quantities.
  Formula: f'(x) = Δa / Δb"
  [a0 a1 b0 b1]
  (verify-nums [a0 a1 b0 b1])
  (/ (delta a0 a1)
     (delta b0 b1)))

(defn average-velocity
  "Calculates average velocity.
  Formula: v = Δs / Δt"
  [s0 s1 t0 t1]
  (rate s0 s1 t0 t1))

(defn acceleration
  "Calculates acceleration.
  Formula: a = Δv / Δt"
  [v0 v1 t0 t1]
  (rate v0 v1 t0 t1))

(defn position
  "Calculates position in uniform motion.
  Formula: s = s0 + v*t"
  [s0 v t]
  (verify-nums [s0 v t])
  (+ s0 (* v t)))

(defn time
  "Calculates time in uniform motion.
  Formula: t = d / v"
  [d v]
  (verify-nums [d v])
  (/ d v))

(defn velocity-uam 
  "Calculates velocity in uniformly accelerated motion.
   Formula: v = v0 + a*t"
  [v0 a t]
  (verify-nums [v0 a t])
  (+ v0 (* a t)))

(defn torricelli-velocity-squared
  "Calculates the square of the final velocity using Torricelli's equation.
  Formula: v² = v0² + 2aΔs"
  [v0 a s0 s1]
  (verify-nums [v0 a s0 s1])
  (+ (* v0 v0)
     (* 2 a (delta s0 s1))))

(defn position-uam
  "Calculates position in uniformly accelerated motion.
   Formula: s = s0 + v0 * t + ½ * a * t²"
  [s0 v0 t a]
  (verify-nums [s0 v0 t a])
  (+ s0 
     (* v0 t) 
     (* 0.5 a t t)))
