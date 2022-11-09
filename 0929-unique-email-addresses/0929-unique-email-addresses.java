class Solution {
    public int numUniqueEmails(String[] emails) {
       if(emails == null){
                return 0;
            }
            HashSet<String> mailUnique = new HashSet<>();
            
            for(String in : emails){
                String localName = in.substring(0, in.lastIndexOf('@'));
                String domainName = in.substring(in.lastIndexOf('@'));
                localName = localName.replaceAll("\\.","");
                int index = localName.indexOf('+');
                if(index != -1){
                    localName = localName.substring(0, index);
                }
                mailUnique.add(localName+domainName);
            }
            
            return mailUnique.size();
    }
}