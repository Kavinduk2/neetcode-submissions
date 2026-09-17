class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
      
      for(String string: strs){
        char[] array = string.toCharArray();

        Arrays.sort(array);

        String sorted = new String(array);

        if(map.containsKey(sorted)){

          map.get(sorted).add(string);

        

        }else{
          ArrayList<String> list = new ArrayList<>();
          list.add(string);
          map.put(sorted, list);
        }
      }

      List<List<String>> result = new ArrayList<>();

      for (ArrayList<String> list : map.values()) {
          result.add(list);
      }

      
      return result;
    }
}
