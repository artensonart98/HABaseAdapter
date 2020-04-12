# HABaseAdapter

HABaseAdapter minimizes the efforts needed to setup a RecyclerView.

## Setting up
**Step 1.** Add it in your root build.gradle at the end of repositories:

```
allprojects {
  repositories {
	  ...
		maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency:
```
implementation 'com.github.artensonart98:HABaseAdapter:1.0'
```


## Usage
**Step 1.** Extend `HABaseAdapter` class passing it your model and viewholder class

```
public class MyAdapter extends BaseAdapter<Model, MyAdapter.MyVH> {

  @Override
  public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return new VH(inflate(R.layout.item_layout, parent));
  }

  class MyVH extends BaseViewHolder<Model> {
      TextView title, description;
      public MyVH(@NonNull View itemView) {
          super(itemView);
          title = itemView.findViewById(R.id.your_id);
          description = itemView.findViewById(R.id.your_id);
      }
      @Override
      public void onBind(Model item) {
          title.setText(item.getTitle());
          description.setText(item.getDescription());
      }
  }
}
```

**Step 2.** In your activity or fragment:

```
MyAdapter adapter = new MyAdapter();
adapter.setList(list);

recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(new LinearLayoutManager(this));
```
