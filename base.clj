(def placeholder "🔥 + 🌽 = ?")
(def matomo
  [:script {:type "text/javascript"} "var _paq = window._paq = window._paq || [];
  /* tracker methods like \"setCustomDimension\" should be called before \"trackPageView\" */
  _paq.push(['trackPageView']);
  _paq.push(['enableLinkTracking']);
  (function() {
    var u=\"//analytics.dialogo.io/\";
    _paq.push(['setTrackerUrl', u+'matomo.php']);
    _paq.push(['setSiteId', '3']);
    var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0];
    g.type='text/javascript'; g.async=true; g.src=u+'matomo.js'; s.parentNode.insertBefore(g,s);
  })();"]) [:noscript [:p [:img {:src "//analytics.dialogo.io/matomo.php?idsite=3&amp;rec=1" :style "border:0;" :alt ""}]]]

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
     [:input#huhu.form-control {:placeholder placeholder}]]]]
  matomo]]

