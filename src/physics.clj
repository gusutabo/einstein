(ns physics)

; Δ = final - inicial
(defn delta [initial final]
  (- final initial))

; f'(x) ≈ Δf / Δt
(defn rate [a0 a1 b0 b1]
  (/ (delta a0 a1)
     (delta b0 b1)))

; Vm = Δs / Δt
(defn velocity [s0 s1 t0 t1]
  (rate s0 s1 t0 t1))

; a = Δv / Δt
(defn acceleration [v0 v1 t0 t1]
  (rate v0 v1 t0 t1))

; S = S0 + v*t
(defn position [s0 v t]
  (+ s0 (* v t)))