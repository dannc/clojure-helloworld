(ns clj-helloworld.core-test
  (:require [clojure.test :refer :all]
            [clj-helloworld.core :refer :all]))

(deftest a-test
  (testing "Hello test."
    (is (= "Hello, World!") (-main))))
