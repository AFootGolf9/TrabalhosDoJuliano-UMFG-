using System.ComponentModel;

namespace trabalho.Components.Enums
{
    public enum TipoUsuario
    {
        [Description("Administrador")]
        Administrador,
        [Description("Usuário Comum")]
        UsuarioComum,
        [Description("Visitante")]
        Visitante
    }
}