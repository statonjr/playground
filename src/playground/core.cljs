(ns playground.core
  (:require [reagent.core :as reagent :refer [atom]]
            [playground.buttons :as b]
            [playground.topbar :as t]
            [playground.breadcrumbs :as bc]
            [playground.typography :as typo]
            [playground.subnav :as subnav]
            [playground.magellan :as m]))

(enable-console-print!)

(defn simple-component
  "Compose a page"
  []
  [:div#top {:data-magellan-destination "top"}]
  [:div.off-canvas-wrap {:data-offcanvas ""}
   [:div.innerwrap
    [:section.main-section
     [:div.row
      [:div.large-12.columns
       [:h1.magellan {:data-magellan-destination "magellan"} "Magellan"
        [m/magellan "magellan" "topbar" "typography" "iconbar" "sidenav" "subnav" "breadcrumbs" "pagination" "buttons" "forms" "tables" "tabs"]]
       [:h1.topbar {:data-magellan-destination "topbar"} "Topbar"
        [t/topbar]]
       [:h1.typography {:data-magellan-destination "typography"} "Typography"
        [:div.row
         [:div.large-6.columns
          ;; TODO: Find a way to make these into functions
          [:h1 "h1. This is a very large header"]
          [:h2 "h2. This is a large header"]]]
        [:div.row
         [:div.large-6.columns
          [:h1.small "h1. Small segment header"]]]]
       [:h1.iconbar {:data-magellan-destination "iconbar"} "Iconbar"]
       [:h1.sidenav {:data-magellan-destination "sidenav"} "Sidenav"]
       [:h1.subnav {:data-magellan-destination "Subnav"} "Subnav"
        [subnav/filter-nav ["All" "Active" "Pending"]]]
       [:h1.breadcrumbs {:data-magellan-destination "breadcrumbs"} "Breadcrumbs"
        [bc/breadcrumbs ["Home" "Features" "Gene Splicing" "Cloning" "Moose"]]]
       [:h1.pagniation {:data-magellan-destination "pagination"} "Pagination"]
       [:h1.buttons {:data-magellan-destination "buttons"} "Buttons"
        [b/basic-button "Tiny" :tiny]]
       [:h1.forms {:data-magellan-destination "forms"} "Forms"]
       [:h1.tables {:data-magellan-destination "tables"} "Tables"]
       [:h1.tabs {:data-magellan-destination "tabs"} "Tabs"]]]]]])

(defn render-page []
  (reagent/render-component (fn [] [simple-component])
                            (.-body js/document)))

;; (println "Hello from playground!")
(render-page)