//
//  Created for SampleApp in 2020
//
//  Copyright © 2020 D4L data4life gGmbh. All rights reserved.
//

import SwiftUI
import FHIR

let text = Sample(number: 2).checkMe()

let hello = LibraryKt.hello()

struct ContentView: View {
    var body: some View {
        VStack {
            Text("Hello, World!")
            Text("The answer is  \(text)")
            Text(hello)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
