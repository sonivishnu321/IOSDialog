# IOSDialog

for creating two buttons dialog -> 
```
iOSDialogBuilder(this@MainActivity)
        .setTitle(getString(R.string.example_title))
        .setSubtitle(getString(R.string.example_subtitle))
        .setBoldPositiveLabel(true)
        .setCancelable(false)
        .setPositiveListener(
            getString(R.string.ok)
        ) { dialog ->
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        .setNegativeListener(
            getString(R.string.dismiss)
        ) { dialog -> dialog.dismiss() }
        .build().show()
   ```
        
       
        
For Creating one button dialog ->
```
iOSDialogBuilder(this@MainActivity)
        .setTitle(getString(R.string.example_title))
        .setSubtitle(getString(R.string.example_subtitle))
        .setBoldPositiveLabel(true)
        .setNegativeButtonExist(false)
        .setCancelable(false)
        .setPositiveListener(
            getString(R.string.ok)
        ) { dialog ->
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        .build().show()

        ![Screenshot_1645182528](https://user-images.githubusercontent.com/99962380/154671644-22645206-b3f4-4e2b-a6bc-6d09e2feff1a.png)
