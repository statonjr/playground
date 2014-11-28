(ns playground.subnav
  (:require [reagent.core :as reagent :refer [atom]]
            [clojure.string :as str]))

(def current-item (atom nil))

(defn create-nav-item
  [attr label]
  [:dd {:class (when (= attr @current-item) "active")
        :key attr}
   [:a {:href "#" :on-click #(reset! current-item attr)} label]])

(defn filter-nav
  [items]
  [:dl.sub-nav
   [:dt "Filter"
    (doall (for [item items]
             (create-nav-item (str/lower-case item) item)))]])