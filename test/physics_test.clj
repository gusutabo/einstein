(ns physics-test
  (:require [clojure.test :refer :all]
            [physics :refer :all]))

(deftest delta-test
  (is (= 10 (delta 0 10)))
  (is (= -5 (delta 5 0))))

(deftest rate-test
  (is (= 2 (rate 0 10 0 5)))
  (is (= 5 (rate 0 20 0 4))))

(deftest equations-test
  ;; S0 -> 0m
  ;; S1 -> 150m
  ;; T0 -> 0s
  ;; T1 -> 10s
  (testing "Average Velocity"
    (is (= 15 (average-velocity 0 150 0 10))))

  ;; V0 -> 5m
  ;; V1 -> 25m
  ;; T0 -> 0s
  ;; T1 -> 4s
  (testing "Acceleration"
    (is (= 5 (acceleration 5 25 0 4))))

  ;; S0 -> 10m
  ;; v -> 6m/s
  ;; t -> 8s
  (testing "Position"
    (is (= 58 (position 10 6 8)))))

(deftest validation-erros 
  (testing "Avarage velocity missing argument."
    (is (thrown? clojure.lang.ExceptionInfo
                 (average-velocity 0 10 0 nil))))

  (testing "Acceleration missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (acceleration 0 10 0 nil))))

  (testing "Position missing argument"
     (is (thrown? clojure.lang.ExceptionInfo
                  (position 10 0 nil)))))

(run-tests)