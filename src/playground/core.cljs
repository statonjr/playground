(ns playground.core
  (:require [reagent.core :as reagent :refer [atom]]
            [playground.buttons :as b]
            [playground.topbar :as t]
            [playground.breadcrumbs :as bc]
            [playground.typography :as typo]
            [playground.subnav :as subnav]))

(enable-console-print!)

(defn simple-component
  "Compose a header and panel"
  []
  [:div
   [t/topbar]
   [bc/breadcrumbs ["Home" "Features" "Gene Splicing" "Clonin"]]
   [:h1 "Playground"]
   [typo/subheader "h3" "Composition"]
   [subnav/filter-nav ["All" "Active" "Pending"]]
   [b/basic-button "Tiny" :tiny]])

(defn render-page []
  (reagent/render-component (fn [] [simple-component])
                            (.-body js/document)))

;; (println "Hello from playground!")
(render-page)