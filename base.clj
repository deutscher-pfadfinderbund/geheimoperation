(def placeholder "🔥 + 🌽 = ?")

[:html {:lang "de"}
 [:head
  [:meta {:charset "utf-8"}]
  [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
  [:link {:rel "stylesheet" :href "resources/bootstrap.min.css"}]
  [:script {:src "shrug.js" :type "text/javascript"}]
  [:title "👋"]]
 [:body.container
  [:div.pt-5
   [:h1 "🦹"]
   [:form.form {:onsubmit "event.preventDefault(); checkForm();"}
    [:div.form-group
     [:input#huhu.form-control {:placeholder placeholder}]]]]]]
