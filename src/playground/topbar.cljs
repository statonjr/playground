(ns playground.topbar)

(defn topbar
  []
  [:nav.top-bar {:data-topbar "" :role "navigation"}
   [:ul.title-area
    [:li.name
     [:h1
      [:a {:href "#"} "LOGO"]]]]])