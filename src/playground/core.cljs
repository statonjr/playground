(ns playground.core
  (:require [reagent.core :as reagent :refer [atom]]
            [playground.buttons :as b]
            [playground.topbar :as t]
            [playground.breadcrumbs :as bc]
            [playground.typography :as typo]
            [playground.subnav :as subnav]
            [playground.magellan :as m]
            [playground.logo :as logo]))

(enable-console-print!)

(defn simple-component
  "Compose a page"
  []
  ; TODO: Decompose this into its own namespace(s)
  [:div#top {:data-magellan-destination "top"}]
  [:div.off-canvas-wrap {:data-offcanvas ""}
   [:div.innerwrap
    [:nav.tab-bar
     [:section.left-small
      [:a.left-off-canvas-toggle.menu-icon {:href "#"}
       [:span]]]
     [:section.middle.tab-bar.section
      [:h1.title
       [logo/small-hendrick-logo]]]
     [:section.right-small
      [:a.right-off-canvas-toggle.menu-icon {:href "#"}
       [:span]]]]
    [:aside.left-off-canvas-menu
     [:ul.off-canvas-list
      [:li
       [:label "Foundation"]]
      [:li
       [:a {:href "#"} "The Psychohistorians"]]
      [:li
       [:a {:href "#"} "..."]]]]
    [:aside.right-off-canvas-menu
     [:ul.off-canvas-list
      [:li
       [:label "Users"]]
      [:li
       [:a {:href "#"} "Harry Seldon"]]
      [:li
       [:a {:href "#"} "..."]]]]
    [:section.main-section
     [:div.row
      [:div.large-12.columns
       [:h1#magellan {:data-magellan-destination "magellan"} "Magellan"]
       [m/magellan "magellan" "topbar" "typography" "iconbar" "sidenav" "subnav" "breadcrumbs" "pagination" "buttons" "forms" "tables" "tabs"]
       [:hr]
       [:h1#topbar {:data-magellan-destination "topbar"} "Topbar"]
       [t/topbar]
       [:hr]
       [:h1#typography {:data-magellan-destination "typography"} "Typography"]
       [:div.row
        [:div.large-6.columns
         ;; TODO: Find a way to make these into functions
         [:h1 "h1. This is a very large header"]
         [:h2 "h2. This is a large header"]]]
       [:div.row
        [:div.large-6.columns
         [:h1.small "h1. Small segment header"]]]
       [:hr]
       [:h1#iconbar {:data-magellan-destination "iconbar"} "Iconbar"]
       [:hr]
       [:h1#sidenav {:data-magellan-destination "sidenav"} "Sidenav"]
       [:hr]
       [:h1#subnav {:data-magellan-destination "Subnav"} "Subnav"]
       [subnav/filter-nav ["All" "Active" "Pending"]]
       [:hr]
       [:h1#breadcrumbs {:data-magellan-destination "breadcrumbs"} "Breadcrumbs"]
       [bc/breadcrumbs "Home" "Features" "Gene Splicing" "Cloning"]
       [:hr]
       [:h1#pagniation {:data-magellan-destination "pagination"} "Pagination"]
       [:hr]
       [:h1#buttons {:data-magellan-destination "buttons"} "Buttons"]
       [:h2 "Basic Buttons"
        [:ul.large-block-grid-3
         [:li
          [b/basic-button "Tiny Button" :tiny]]
         [:li
          [b/basic-button "Small Button" :small]]
         [:li
          [b/basic-button "Success Button" :success]]
         [:li
          [b/basic-button "Secondary Button" :secondary]]
         [:li
          [b/basic-button "Alert Button" :alert]]
         [:li
          [b/basic-button "Disabled Button" :disabled]]]]
       [:h2 "Icon & Text Buttons"
        [:ul.large-block-grid-3
         [:li
          [b/icon-button "Tiny Button" :tiny]]]]
       [:hr]
       [:h1#forms {:data-magellan-destination "forms"} "Forms"]
       [:hr]
       [:h1#tables {:data-magellan-destination "tables"} "Tables"]
       [:hr]
       [:h1#tabs {:data-magellan-destination "tabs"} "Tabs"]]]]]])

(defn render-page []
  (reagent/render-component (fn [] [simple-component])
                            (.-body js/document)))

;; (println "Hello from playground!")
(render-page)