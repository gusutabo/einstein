(ns einstein.kinematics-test
  (:require [clojure.test :refer :all]
            [einstein.kinematics :refer :all]))

(deftest delta-test
  (is (= 10 (delta 0 10)))
  (is (= -5 (delta 5 0))))

(deftest rate-test
  (is (= 2 (rate 0 10 0 5)))
  (is (= 5 (rate 0 20 0 4))))

(deftest equations-test
  (testing "Average Velocity"
    (is (= 15 (average-velocity 0 150 0 10))))

  (testing "Acceleration"
    (is (= 5 (acceleration 5 25 0 4))))

  (testing "Position"
    (is (= 58 (position 10 6 8))))

  (testing "Time in uniform motion" 
    (is (= 10 (time 100 10))))

  (testing "Velocity in uniformly accelerated motion" 
    (is (= 25 (velocity-uam 5 5 4))))

  (testing "Torricelli velocity squared"
    (is (= 40 (torricelli-velocity-squared 0 2 0 10))))

  (testing "Position in uniformly accelerated motion"
    (is (= 24 (position-uam 0 10 2 2)))))

(deftest validation-errors
  (testing "Average velocity missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (average-velocity 0 10 0 nil))))

  (testing "Acceleration missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (acceleration 0 10 0 nil))))

  (testing "Position missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (position 10 0 nil))))

  (testing "Time missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (time 10 nil))))

  (testing "Velocity UAM missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (velocity-uam 10 nil 5))))

  (testing "Torricelli missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (torricelli-velocity-squared 0 2 0 nil))))

  (testing "Position UAM missing argument"
    (is (thrown? clojure.lang.ExceptionInfo
                 (position-uam 0 10 nil 2)))))

(run-tests)