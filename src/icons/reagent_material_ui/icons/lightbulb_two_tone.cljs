(ns reagent-material-ui.icons.lightbulb-two-tone
  "Imports @material-ui/icons/LightbulbTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def lightbulb-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4C8.97 4 6.5 6.47 6.5 9.5c0 2.47 1.49 3.89 2.35 4.5h6.3c.86-.61 2.35-2.03 2.35-4.5C17.5 6.47 15.03 4 12 4z", "opacity" ".3"}) (e "path" #js {"d" "M12 22c1.1 0 2-.9 2-2h-4c0 1.1.9 2 2 2zm-4-5h8v2H8zm4-15C7.86 2 4.5 5.36 4.5 9.5c0 3.82 2.66 5.86 3.77 6.5h7.46c1.11-.64 3.77-2.68 3.77-6.5C19.5 5.36 16.14 2 12 2zm3.15 12h-6.3c-.86-.61-2.35-2.03-2.35-4.5C6.5 6.47 8.97 4 12 4s5.5 2.47 5.5 5.5c0 2.47-1.49 3.89-2.35 4.5z"})]
                                         "LightbulbTwoTone"))
