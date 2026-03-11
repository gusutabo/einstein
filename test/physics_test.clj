(ns physics-test
  (:require [clojure.test :refer :all]
            [physics :refer :all]))

(deftest delta-test
  (is (= 10 (delta 0 10)))
  (is (= -5 (delta 5 0))))

(deftest rate-test
  (is (= 2 (rate 0 10 0 5)))
  (is (= 5 (rate 0 20 0 4))))

(deftest velocity-test
  ;; S0 -> 0m
  ;; S1 -> 150m
  ;; T0 -> 0s
  ;; T1 -> 10s
  (is (= 15 (velocity 0 150 0 10))))

(deftest acceleration-test
  ;; V0 -> 5m
  ;; V1 -> 25m
  ;; T0 -> 0s
  ;; T1 -> 4s

  (is (= 5 (acceleration 5 25 0 4))))

(deftest position-test
  ;; S0 -> 10m
  ;; v -> 6m/s
  ;; t -> 8s
  
  (is (= 58 (position 10 6 8))))

(run-tests)