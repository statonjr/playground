(ns playground.topbar
  (:require [playground.logo :as logo]))

(defn topbar
  []
  [:nav.top-bar {:data-topbar "" :role "navigation"}
   [:ul.title-area
    [:li.name
     [:h1
      [:a {:href "#"}
       [logo/small-hendrick-logo]]]]
    [:li.toggle-topbar.menu-icon
     [:a {:href "#"}
      [:span "Menu"]]]]
   [:section.top-bar-section
    [:ul.right
     [:li.has-button
      [:a {:href "#"}
       [:i.icon-plus "Add New"]]]
     [:li
      [:a {:href "#"}]]
     [:li.has-dropdown
      [:a {:href "#"} "Dropdown"]
      [:ul.dropdown
       [:li
        [:a {:href "#"} "Option 1"]]
       [:li.divider]
       [:li
        [:a {:href "#"} "Option 2"]]
       [:li.divider]
       [:li
        [:a {:href "#"} "Option 3"]]
       [:li.divider]]]]
    [:ul.left
     [:li.has-form
      [:div.field
       [:input {:placeholder "Search" :type "text"}]]]]]])