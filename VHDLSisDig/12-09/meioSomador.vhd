-- Bruno Neves
-- neves.bruno@edu.pucrs.br

library ieee;
    use ieee.std_logic_1164.all; 

entity halfAdder is
port 
(
    a   :   in  std_logic;
    b   :   in  std_logic;
    s   :   out std_logic;
    co  :   out std_logic
);
end halfAdder;

architecture ha of halfAdder is 

begin

    s <= a xor b;
    co <= a and b;

end ha;