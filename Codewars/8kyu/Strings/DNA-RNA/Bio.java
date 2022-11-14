/* CodeWars 8kyu - DNA to RNA Conversion 

Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. 
It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
Ribonucleic acid, RNA, is the primary messenger molecule in cells. 
RNA differs slightly from DNA its chemical structure and contains no Thymine. 
In RNA Thymine is replaced by another nucleic acid Uracil ('U').
Create a function which translates a given DNA string into RNA.

For example: "GCAT"  =>  "GCAU"

The input string can be of arbitrary length - in particular, it may be empty. 
All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.
*/

public class Bio {
    public String dnaToRna(String dna) {
        String rna = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'T') {
                rna += "U";
            } else {
                rna += dna.charAt(i);
            }
        }
        return rna;
    }

    // .replace()
    public String dnaToRnaReplace(String dna) {
        return dna.replace("T", "U");
    }

    // .toCharArray()
    public String dnaToRnaCharArray(String dna) {
        char[] arr = dna.toCharArray();
        String rna = "";

        for (int i=0; i<arr.length; i++) {
            if ((arr[i]) == 'T') {
                arr[i] = 'U';
            }
        }
        rna = String.valueOf(arr);
        return rna;
    }

    // Enhanced Loop:
    public String dnaToRna4(String dna) {
        String rna = "";
        char[] letters = dna.toCharArray();
        for (char c : letters) {
            if (c == 'T') {
                rna += 'U';
            } else {
                rna += c;
            }
        }
        return rna;
    }
}